package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectProperty {

  def apply(
    id: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty.Builder)
      .id(id.orNull)
      .build()
}
