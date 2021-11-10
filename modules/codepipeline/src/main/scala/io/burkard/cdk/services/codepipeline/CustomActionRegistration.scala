package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomActionRegistration {

  def apply(
    internalResourceId: String,
    entityUrl: Option[String] = None,
    artifactBounds: Option[software.amazon.awscdk.services.codepipeline.ActionArtifactBounds] = None,
    provider: Option[String] = None,
    version: Option[String] = None,
    executionUrl: Option[String] = None,
    category: Option[software.amazon.awscdk.services.codepipeline.ActionCategory] = None,
    actionProperties: Option[List[_ <: software.amazon.awscdk.services.codepipeline.CustomActionProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.CustomActionRegistration =
    software.amazon.awscdk.services.codepipeline.CustomActionRegistration.Builder
      .create(stackCtx, internalResourceId)
      .entityUrl(entityUrl.orNull)
      .artifactBounds(artifactBounds.orNull)
      .provider(provider.orNull)
      .version(version.orNull)
      .executionUrl(executionUrl.orNull)
      .category(category.orNull)
      .actionProperties(actionProperties.map(_.asJava).orNull)
      .build()
}
