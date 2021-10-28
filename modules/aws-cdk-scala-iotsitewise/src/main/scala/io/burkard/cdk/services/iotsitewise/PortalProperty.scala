package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PortalProperty {

  def apply(
    id: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty.Builder)
      .id(id.orNull)
      .build()
}
