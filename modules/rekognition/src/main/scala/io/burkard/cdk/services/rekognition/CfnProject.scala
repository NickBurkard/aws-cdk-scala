package io.burkard.cdk.services.rekognition

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    projectName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rekognition.CfnProject =
    software.amazon.awscdk.services.rekognition.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName)
      .build()
}
