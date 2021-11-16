package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsCloudFormationStackProperties {

  def apply(
    templateFile: String,
    assumeRoleArn: Option[String] = None,
    validateOnSynth: Option[Boolean] = None,
    tags: Option[Map[String, String]] = None,
    terminationProtection: Option[Boolean] = None,
    assumeRoleExternalId: Option[String] = None,
    requiresBootstrapStackVersion: Option[Number] = None,
    stackName: Option[String] = None,
    bootstrapStackVersionSsmParameter: Option[String] = None,
    cloudFormationExecutionRoleArn: Option[String] = None,
    parameters: Option[Map[String, String]] = None,
    stackTemplateAssetObjectUrl: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties =
    (new software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties.Builder)
      .templateFile(templateFile)
      .assumeRoleArn(assumeRoleArn.orNull)
      .validateOnSynth(validateOnSynth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .terminationProtection(terminationProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .assumeRoleExternalId(assumeRoleExternalId.orNull)
      .requiresBootstrapStackVersion(requiresBootstrapStackVersion.orNull)
      .stackName(stackName.orNull)
      .bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter.orNull)
      .cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl.orNull)
      .build()
}
