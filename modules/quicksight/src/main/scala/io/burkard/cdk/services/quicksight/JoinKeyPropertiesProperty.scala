package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JoinKeyPropertiesProperty {

  def apply(
    uniqueKey: Option[Boolean] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty.Builder)
      .uniqueKey(uniqueKey.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
