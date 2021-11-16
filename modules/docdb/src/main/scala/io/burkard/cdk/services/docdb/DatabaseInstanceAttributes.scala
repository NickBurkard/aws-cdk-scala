package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseInstanceAttributes {

  def apply(
    instanceEndpointAddress: String,
    instanceIdentifier: String,
    port: Number
  ): software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes =
    (new software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes.Builder)
      .instanceEndpointAddress(instanceEndpointAddress)
      .instanceIdentifier(instanceIdentifier)
      .port(port)
      .build()
}
