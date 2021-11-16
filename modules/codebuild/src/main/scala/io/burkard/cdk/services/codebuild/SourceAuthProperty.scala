package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceAuthProperty {

  def apply(
    `type`: String,
    resource: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder)
      .`type`(`type`)
      .resource(resource.orNull)
      .build()
}
