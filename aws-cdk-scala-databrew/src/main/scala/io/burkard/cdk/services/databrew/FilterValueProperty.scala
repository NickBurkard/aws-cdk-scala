package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FilterValueProperty {

  def apply(
    valueReference: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty.Builder)
      .valueReference(valueReference.orNull)
      .value(value.orNull)
      .build()
}
