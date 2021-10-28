package io.burkard.cdk.services.workspaces

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectionAliasAssociationProperty {

  def apply(
    resourceId: Option[String] = None,
    connectionIdentifier: Option[String] = None,
    associationStatus: Option[String] = None,
    associatedAccountId: Option[String] = None
  ): software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty =
    (new software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty.Builder)
      .resourceId(resourceId.orNull)
      .connectionIdentifier(connectionIdentifier.orNull)
      .associationStatus(associationStatus.orNull)
      .associatedAccountId(associatedAccountId.orNull)
      .build()
}
