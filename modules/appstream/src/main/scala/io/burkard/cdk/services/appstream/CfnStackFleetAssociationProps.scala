package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStackFleetAssociationProps {

  def apply(
    fleetName: String,
    stackName: String
  ): software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps =
    (new software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder)
      .fleetName(fleetName)
      .stackName(stackName)
      .build()
}
