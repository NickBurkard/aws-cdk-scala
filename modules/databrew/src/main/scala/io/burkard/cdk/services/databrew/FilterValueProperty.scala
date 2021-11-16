package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilterValueProperty {

  def apply(
    valueReference: String,
    value: String
  ): software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty.Builder)
      .valueReference(valueReference)
      .value(value)
      .build()
}
