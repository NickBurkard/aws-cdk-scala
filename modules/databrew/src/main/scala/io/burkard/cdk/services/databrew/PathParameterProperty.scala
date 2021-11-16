package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PathParameterProperty {

  def apply(
    datasetParameter: software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty,
    pathParameterName: String
  ): software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty.Builder)
      .datasetParameter(datasetParameter)
      .pathParameterName(pathParameterName)
      .build()
}
