package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataSetReferenceProperty {

  def apply(
    dataSetArn: Option[String] = None,
    dataSetPlaceholder: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnAnalysis.DataSetReferenceProperty =
    (new software.amazon.awscdk.services.quicksight.CfnAnalysis.DataSetReferenceProperty.Builder)
      .dataSetArn(dataSetArn.orNull)
      .dataSetPlaceholder(dataSetPlaceholder.orNull)
      .build()
}
