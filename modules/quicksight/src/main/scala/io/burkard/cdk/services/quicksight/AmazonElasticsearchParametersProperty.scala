package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AmazonElasticsearchParametersProperty {

  def apply(
    domain: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty.Builder)
      .domain(domain.orNull)
      .build()
}