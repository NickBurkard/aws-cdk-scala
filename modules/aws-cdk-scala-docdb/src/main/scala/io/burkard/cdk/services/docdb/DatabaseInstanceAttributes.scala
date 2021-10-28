package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseInstanceAttributes {

  def apply(
    instanceEndpointAddress: Option[String] = None,
    instanceIdentifier: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes =
    (new software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes.Builder)
      .instanceEndpointAddress(instanceEndpointAddress.orNull)
      .instanceIdentifier(instanceIdentifier.orNull)
      .port(port.orNull)
      .build()
}
