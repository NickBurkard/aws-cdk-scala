package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmazonOpenSearchParametersProperty {

  def apply(
    domain: String
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty.Builder)
      .domain(domain)
      .build()
}
