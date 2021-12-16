import java.lang.reflect.Modifier

import scala.util.matching.Regex

import sbt._

import com.google.common.base.CaseFormat

object codegen {
  // Service-based builders.
  // `.service` package is optional.
  val ServiceRegex: Regex = raw"^software\.amazon\.awscdk(\.services)?\.([a-z0-9]+).*".r

  // General builders, often shared between services.
  val CoreRegex: Regex = raw"^software\.amazon\.awscdk".r

  // Package rewrite rules in descending order of precedence.
  private[this] val packageRewrites: List[(Regex, Regex.Match => String)] =
    List(
      ServiceRegex -> { m =>
        if (m.group(1) == null) {
          val second = m.group(2)
          if (CoreOverrides.contains(second)) {
            s"io.burkard.cdk.core.$second"
          } else {
            s"io.burkard.cdk.$second"
          }
        } else {
          s"io.burkard.cdk.services.${m.group(2)}"
        }
      },
      CoreRegex -> { _ => "io.burkard.cdk.core" }
    )

  // Package names that must be in `core` module.
  val CoreOverrides: Set[String] = Set("assertions")

  // Potentially rename a package.
  def renamePackage(name: String): String =
    packageRewrites.foldLeft(name) { case (value, (regex, replacer)) =>
      regex.replaceAllIn(value, replacer)
    }

  private[this] val scala2ReservedWords: Set[String] =
    Set(
      "abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally", "for",
      "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package",
      "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type",
      "val", "var", "while", "with", "yield"
    )

  // All known AWS services.
  val KnownAwsServiceNames: Set[String] =
    Set(
      "accessanalyzer", "acmpca", "alexa", "amazonmq", "amplify", "apigateway", "apigatewayv2", "appconfig", "appflow",
      "appintegrations", "applicationautoscaling", "applicationinsights", "appmesh", "apprunner", "appstream",
      "appsync", "aps", "athena", "auditmanager", "autoscaling", "autoscalingplans", "backup", "batch", "budgets",
      "cassandra", "ce", "certificatemanager", "chatbot", "cloud9", "cloudassembly", "cloudformation", "cloudfront",
      "cloudtrail", "cloudwatch", "codeartifact", "codebuild", "codecommit", "codedeploy", "codeguruprofiler",
      "codegurureviewer", "codepipeline", "codestar", "codestarconnections", "codestarnotifications", "cognito",
      "config", "connect", "core", "cur", "customerprofiles", "customresources", "cxapi", "databrew", "datapipeline",
      "datasync", "dax", "detective", "devopsguru", "directoryservice", "dlm", "dms", "docdb", "dynamodb", "ec2",
      "ecr", "ecs", "efs", "eks", "elasticache", "elasticbeanstalk", "elasticloadbalancing", "elasticloadbalancingv2",
      "elasticsearch", "emr", "emrcontainers", "events", "eventschemas", "finspace", "fis", "fms", "frauddetector",
      "fsx", "gamelift", "globalaccelerator", "glue", "greengrass", "greengrassv2", "groundstation", "guardduty",
      "healthlake", "iam", "imagebuilder", "inspector", "iot", "iot1click", "iotanalytics", "iotcoredeviceadvisor",
      "iotevents", "iotfleethub", "iotsitewise", "iotthingsgraph", "iotwireless", "ivs", "kendra", "kinesis",
      "kinesisanalytics", "kinesisfirehose", "kms", "lakeformation", "lambda", "lambdalayer", "licensemanager",
      "lightsail", "location", "logs", "lookoutequipment", "lookoutmetrics", "lookoutvision", "macie",
      "managedblockchain", "mediaconnect", "mediaconvert", "medialive", "mediapackage", "mediastore",
      "memorydb", "msk", "mwaa", "neptune", "networkfirewall", "networkmanager", "nimblestudio", "opensearchservice",
      "opsworks", "opsworkscm", "panorama", "pinpoint", "pinpointemail", "pipelines", "qldb", "quicksight", "ram",
      "rds", "redshift", "regioninfo", "rekognition", "resourcegroups", "robomaker", "route53",
      "route53recoverycontrol", "route53recoveryreadiness", "route53resolver", "s3", "s3objectlambda", "s3outposts",
      "sagemaker", "sam", "sdb", "secretsmanager", "securityhub", "servicecatalog", "servicecatalogappregistry",
      "servicediscovery", "ses", "signer", "sns", "sqs", "ssm", "ssmcontacts", "ssmincidents", "sso", "stepfunctions",
      "synthetics", "timestream", "transfer", "waf", "wafv2", "wisdom", "workspaces", "xray"
    )

  // Literally identify reserved words.
  def literallyIdentify(name: String): String =
    if (scala2ReservedWords.contains(name)) {
      s"`$name`"
    } else {
      name
    }

  // Rewrite rules for Java types in order of descending precedence.
  private[this] val javaRewrites: List[(Regex, String)] =
    List(
      raw"java\.lang\.Boolean".r -> "Boolean",
      raw"java\.lang\.Number".r -> "Number",
      raw"java\.lang\.Object".r -> "AnyRef",
      raw"java\.lang\.String".r -> "String",
      raw"java\.util\.Map".r -> "Map",
      raw"java\.util\.List".r -> "List",
      raw"<".r -> "[",
      raw">".r -> "]",
      raw"extends".r -> "<:",
      raw"\?".r -> "_"
    )

  // Rewrite any java types in a type name.
  def rewriteJavaTypes(typeName: String): String =
    javaRewrites.foldLeft(typeName) { case (value, (regex, replacement)) =>
      regex.replaceAllIn(value, replacement)
    }

  // Does a type require java converters?
  def requiresJavaConverters(typeName: String): Boolean =
    typeName.contains("List[") || typeName.contains("Map[")

  final implicit class ClassOps(private val c: Class[_]) extends AnyVal {
    def requiredFieldNames: Set[String] =
      c.getDeclaredMethods.toList
        .collect {
          case m if !Modifier.isStatic(m.getModifiers) && m.getName.startsWith("get") && !m.isDefault =>
            CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, m.getName.stripPrefix("get"))
        }
        .toSet
  }

  final implicit class SourceGeneratorOps[A: SourceGenerator](private val a: A) {
    def writeFile(root: File): File =
      SourceGenerator[A].writeFile(root, a)
  }

  final implicit class SbtFileOps(private val root: File) extends AnyVal {
    // Traverse down a path that has embedded slashes.
    def /~(path: String): File =
      path.split('/').foldLeft(root)(_ / _)
  }
}
