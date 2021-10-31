package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BuildImageConfig {

  def apply: software.amazon.awscdk.services.codebuild.BuildImageConfig =
    (new software.amazon.awscdk.services.codebuild.BuildImageConfig.Builder)
      
      .build()
}
