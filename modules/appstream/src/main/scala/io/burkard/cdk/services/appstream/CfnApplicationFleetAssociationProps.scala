package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationFleetAssociationProps {

  def apply(
    applicationArn: String,
    fleetName: String
  ): software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps =
    (new software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps.Builder)
      .applicationArn(applicationArn)
      .fleetName(fleetName)
      .build()
}
