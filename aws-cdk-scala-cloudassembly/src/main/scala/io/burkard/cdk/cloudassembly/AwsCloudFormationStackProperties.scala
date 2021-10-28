package io.burkard.cdk.cloudassembly

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsCloudFormationStackProperties {

  def apply(
    assumeRoleArn: Option[String] = None,
    validateOnSynth: Option[Boolean] = None,
    tags: Option[Map[String, String]] = None,
    templateFile: Option[String] = None,
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
      .assumeRoleArn(assumeRoleArn.orNull)
      .validateOnSynth(validateOnSynth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .templateFile(templateFile.orNull)
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
