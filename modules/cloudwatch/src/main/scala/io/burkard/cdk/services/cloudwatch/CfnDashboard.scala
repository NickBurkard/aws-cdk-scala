package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDashboard {

  def apply(
    internalResourceId: String,
    dashboardBody: Option[String] = None,
    dashboardName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.CfnDashboard =
    software.amazon.awscdk.services.cloudwatch.CfnDashboard.Builder
      .create(stackCtx, internalResourceId)
      .dashboardBody(dashboardBody.orNull)
      .dashboardName(dashboardName.orNull)
      .build()
}
