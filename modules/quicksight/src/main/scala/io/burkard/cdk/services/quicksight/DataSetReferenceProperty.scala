package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataSetReferenceProperty {

  def apply(
    dataSetArn: Option[String] = None,
    dataSetPlaceholder: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnTemplate.DataSetReferenceProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTemplate.DataSetReferenceProperty.Builder)
      .dataSetArn(dataSetArn.orNull)
      .dataSetPlaceholder(dataSetPlaceholder.orNull)
      .build()
}
