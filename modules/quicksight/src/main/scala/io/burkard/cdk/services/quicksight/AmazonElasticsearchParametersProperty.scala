package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmazonElasticsearchParametersProperty {

  def apply(
    domain: String
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty.Builder)
      .domain(domain)
      .build()
}
