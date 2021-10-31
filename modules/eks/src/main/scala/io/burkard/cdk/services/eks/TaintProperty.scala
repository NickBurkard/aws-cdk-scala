package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaintProperty {

  def apply(
    effect: Option[String] = None,
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty =
    (new software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty.Builder)
      .effect(effect.orNull)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
