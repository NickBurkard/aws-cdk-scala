package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BuildImageBindOptions {

  def apply: software.amazon.awscdk.services.codebuild.BuildImageBindOptions =
    (new software.amazon.awscdk.services.codebuild.BuildImageBindOptions.Builder)
      
      .build()
}
