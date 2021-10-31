package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserProperty {

  def apply(
    id: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty.Builder)
      .id(id.orNull)
      .build()
}
