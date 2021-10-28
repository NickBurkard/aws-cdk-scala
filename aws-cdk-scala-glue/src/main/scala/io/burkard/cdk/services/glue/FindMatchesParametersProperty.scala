package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FindMatchesParametersProperty {

  def apply(
    accuracyCostTradeoff: Option[Number] = None,
    precisionRecallTradeoff: Option[Number] = None,
    primaryKeyColumnName: Option[String] = None,
    enforceProvidedLabels: Option[Boolean] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty.Builder)
      .accuracyCostTradeoff(accuracyCostTradeoff.orNull)
      .precisionRecallTradeoff(precisionRecallTradeoff.orNull)
      .primaryKeyColumnName(primaryKeyColumnName.orNull)
      .enforceProvidedLabels(enforceProvidedLabels.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
