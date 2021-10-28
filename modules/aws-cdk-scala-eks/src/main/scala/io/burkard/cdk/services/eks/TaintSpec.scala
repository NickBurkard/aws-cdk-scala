package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TaintSpec {

  def apply(
    effect: Option[software.amazon.awscdk.services.eks.TaintEffect] = None,
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.eks.TaintSpec =
    (new software.amazon.awscdk.services.eks.TaintSpec.Builder)
      .effect(effect.orNull)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
