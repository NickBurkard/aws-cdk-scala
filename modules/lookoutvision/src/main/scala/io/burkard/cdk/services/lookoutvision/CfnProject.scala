package io.burkard.cdk.services.lookoutvision

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    projectName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lookoutvision.CfnProject =
    software.amazon.awscdk.services.lookoutvision.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName)
      .build()
}
