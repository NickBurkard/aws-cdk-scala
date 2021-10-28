package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SynthesizeStackArtifactOptions {

  def apply(
    assumeRoleArn: Option[String] = None,
    assumeRoleExternalId: Option[String] = None,
    requiresBootstrapStackVersion: Option[Number] = None,
    additionalDependencies: Option[List[String]] = None,
    bootstrapStackVersionSsmParameter: Option[String] = None,
    cloudFormationExecutionRoleArn: Option[String] = None,
    parameters: Option[Map[String, String]] = None,
    stackTemplateAssetObjectUrl: Option[String] = None
  ): software.amazon.awscdk.SynthesizeStackArtifactOptions =
    (new software.amazon.awscdk.SynthesizeStackArtifactOptions.Builder)
      .assumeRoleArn(assumeRoleArn.orNull)
      .assumeRoleExternalId(assumeRoleExternalId.orNull)
      .requiresBootstrapStackVersion(requiresBootstrapStackVersion.orNull)
      .additionalDependencies(additionalDependencies.map(_.asJava).orNull)
      .bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter.orNull)
      .cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl.orNull)
      .build()
}
