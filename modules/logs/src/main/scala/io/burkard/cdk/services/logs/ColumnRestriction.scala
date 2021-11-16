package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnRestriction {

  def apply(
    comparison: String,
    numberValue: Option[Number] = None,
    stringValue: Option[String] = None
  ): software.amazon.awscdk.services.logs.ColumnRestriction =
    (new software.amazon.awscdk.services.logs.ColumnRestriction.Builder)
      .comparison(comparison)
      .numberValue(numberValue.orNull)
      .stringValue(stringValue.orNull)
      .build()
}
