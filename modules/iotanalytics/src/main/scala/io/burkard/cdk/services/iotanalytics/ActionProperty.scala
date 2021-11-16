package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    actionName: String,
    containerAction: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty] = None,
    queryAction: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder)
      .actionName(actionName)
      .containerAction(containerAction.orNull)
      .queryAction(queryAction.orNull)
      .build()
}
