package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationFleetAssociation {

  def apply(
    internalResourceId: String,
    applicationArn: String,
    fleetName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation =
    software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation.Builder
      .create(stackCtx, internalResourceId)
      .applicationArn(applicationArn)
      .fleetName(fleetName)
      .build()
}
