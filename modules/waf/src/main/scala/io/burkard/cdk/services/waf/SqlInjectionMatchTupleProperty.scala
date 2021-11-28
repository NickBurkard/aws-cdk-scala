package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqlInjectionMatchTupleProperty {

  def apply(
    textTransformation: String,
    fieldToMatch: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty
  ): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder)
      .textTransformation(textTransformation)
      .fieldToMatch(fieldToMatch)
      .build()
}
