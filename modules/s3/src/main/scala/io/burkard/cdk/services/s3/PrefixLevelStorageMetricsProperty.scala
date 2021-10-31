package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrefixLevelStorageMetricsProperty {

  def apply(
    selectionCriteria: Option[software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty] = None,
    isEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty.Builder)
      .selectionCriteria(selectionCriteria.orNull)
      .isEnabled(isEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
