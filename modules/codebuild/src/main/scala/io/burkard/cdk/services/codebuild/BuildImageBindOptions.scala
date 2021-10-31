package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BuildImageBindOptions {

  def apply: software.amazon.awscdk.services.codebuild.BuildImageBindOptions =
    (new software.amazon.awscdk.services.codebuild.BuildImageBindOptions.Builder)
      
      .build()
}
