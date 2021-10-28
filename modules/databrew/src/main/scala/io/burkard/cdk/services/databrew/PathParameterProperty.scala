package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PathParameterProperty {

  def apply(
    datasetParameter: Option[software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty] = None,
    pathParameterName: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty.Builder)
      .datasetParameter(datasetParameter.orNull)
      .pathParameterName(pathParameterName.orNull)
      .build()
}
