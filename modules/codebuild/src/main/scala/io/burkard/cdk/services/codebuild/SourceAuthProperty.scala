package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceAuthProperty {

  def apply(
    resource: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder)
      .resource(resource.orNull)
      .`type`(`type`.orNull)
      .build()
}
