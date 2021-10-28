package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqlInjectionMatchTupleProperty {

  def apply(
    textTransformation: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty] = None
  ): software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty =
    (new software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder)
      .textTransformation(textTransformation.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .build()
}