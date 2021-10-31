package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ObjectTypeFieldProperty {

  def apply(
    source: Option[String] = None,
    contentType: Option[String] = None,
    target: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty.Builder)
      .source(source.orNull)
      .contentType(contentType.orNull)
      .target(target.orNull)
      .build()
}
