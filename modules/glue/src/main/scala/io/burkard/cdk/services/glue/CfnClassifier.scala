package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClassifier {

  def apply(
    internalResourceId: String,
    xmlClassifier: Option[software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty] = None,
    jsonClassifier: Option[software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty] = None,
    csvClassifier: Option[software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty] = None,
    grokClassifier: Option[software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnClassifier =
    software.amazon.awscdk.services.glue.CfnClassifier.Builder
      .create(stackCtx, internalResourceId)
      .xmlClassifier(xmlClassifier.orNull)
      .jsonClassifier(jsonClassifier.orNull)
      .csvClassifier(csvClassifier.orNull)
      .grokClassifier(grokClassifier.orNull)
      .build()
}
