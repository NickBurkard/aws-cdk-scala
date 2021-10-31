package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTagOptionProps {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None,
    active: Option[Boolean] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .active(active.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
