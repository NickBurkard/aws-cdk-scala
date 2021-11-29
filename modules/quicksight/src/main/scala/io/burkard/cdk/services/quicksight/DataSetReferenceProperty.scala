package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataSetReferenceProperty {

  def apply(
    dataSetArn: String,
    dataSetPlaceholder: String
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.DataSetReferenceProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.DataSetReferenceProperty.Builder)
      .dataSetArn(dataSetArn)
      .dataSetPlaceholder(dataSetPlaceholder)
      .build()
}
