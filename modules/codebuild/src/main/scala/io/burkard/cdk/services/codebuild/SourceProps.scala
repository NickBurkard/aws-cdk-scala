package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceProps {

  def apply(
    identifier: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.SourceProps =
    (new software.amazon.awscdk.services.codebuild.SourceProps.Builder)
      .identifier(identifier.orNull)
      .build()
}
