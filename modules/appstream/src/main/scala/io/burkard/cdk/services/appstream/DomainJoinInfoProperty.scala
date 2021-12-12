package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainJoinInfoProperty {

  def apply(
    organizationalUnitDistinguishedName: Option[String] = None,
    directoryName: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty =
    (new software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder)
      .organizationalUnitDistinguishedName(organizationalUnitDistinguishedName.orNull)
      .directoryName(directoryName.orNull)
      .build()
}
