package io.burkard.cdk.services.lookoutvision

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    projectName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lookoutvision.CfnProject =
    software.amazon.awscdk.services.lookoutvision.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName.orNull)
      .build()
}
