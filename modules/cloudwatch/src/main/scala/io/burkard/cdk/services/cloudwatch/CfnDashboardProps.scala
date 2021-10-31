package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDashboardProps {

  def apply(
    dashboardBody: Option[String] = None,
    dashboardName: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnDashboardProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder)
      .dashboardBody(dashboardBody.orNull)
      .dashboardName(dashboardName.orNull)
      .build()
}
