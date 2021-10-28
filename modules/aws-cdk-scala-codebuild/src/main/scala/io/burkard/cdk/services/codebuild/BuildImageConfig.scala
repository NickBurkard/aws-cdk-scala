package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BuildImageConfig {

  def apply: software.amazon.awscdk.services.codebuild.BuildImageConfig =
    (new software.amazon.awscdk.services.codebuild.BuildImageConfig.Builder)
      
      .build()
}
