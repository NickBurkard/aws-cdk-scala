package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomActionRegistrationProps {

  def apply(
    artifactBounds: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds,
    provider: String,
    category: software.amazon.awscdk.services.codepipeline.ActionCategory,
    entityUrl: Option[String] = None,
    version: Option[String] = None,
    executionUrl: Option[String] = None,
    actionProperties: Option[List[_ <: software.amazon.awscdk.services.codepipeline.CustomActionProperty]] = None
  ): software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps =
    (new software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps.Builder)
      .artifactBounds(artifactBounds)
      .provider(provider)
      .category(category)
      .entityUrl(entityUrl.orNull)
      .version(version.orNull)
      .executionUrl(executionUrl.orNull)
      .actionProperties(actionProperties.map(_.asJava).orNull)
      .build()
}
