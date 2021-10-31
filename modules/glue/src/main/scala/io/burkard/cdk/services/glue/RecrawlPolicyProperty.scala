package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecrawlPolicyProperty {

  def apply(
    recrawlBehavior: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty.Builder)
      .recrawlBehavior(recrawlBehavior.orNull)
      .build()
}
