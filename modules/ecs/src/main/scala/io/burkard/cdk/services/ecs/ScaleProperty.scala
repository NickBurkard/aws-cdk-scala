package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScaleProperty {

  def apply(
    unit: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty.Builder)
      .unit(unit.orNull)
      .value(value.orNull)
      .build()
}
