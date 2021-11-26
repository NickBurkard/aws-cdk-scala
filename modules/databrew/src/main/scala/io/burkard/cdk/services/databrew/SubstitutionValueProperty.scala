package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubstitutionValueProperty {

  def apply(
    valueReference: String,
    value: String
  ): software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty =
    (new software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty.Builder)
      .valueReference(valueReference)
      .value(value)
      .build()
}
