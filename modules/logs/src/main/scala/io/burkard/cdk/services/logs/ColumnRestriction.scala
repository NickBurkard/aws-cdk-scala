package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnRestriction {

  def apply(
    comparison: Option[String] = None,
    numberValue: Option[Number] = None,
    stringValue: Option[String] = None
  ): software.amazon.awscdk.services.logs.ColumnRestriction =
    (new software.amazon.awscdk.services.logs.ColumnRestriction.Builder)
      .comparison(comparison.orNull)
      .numberValue(numberValue.orNull)
      .stringValue(stringValue.orNull)
      .build()
}
