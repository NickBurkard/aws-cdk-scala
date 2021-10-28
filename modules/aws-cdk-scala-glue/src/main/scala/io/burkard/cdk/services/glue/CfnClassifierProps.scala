package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClassifierProps {

  def apply(
    xmlClassifier: Option[software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty] = None,
    jsonClassifier: Option[software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty] = None,
    csvClassifier: Option[software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty] = None,
    grokClassifier: Option[software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty] = None
  ): software.amazon.awscdk.services.glue.CfnClassifierProps =
    (new software.amazon.awscdk.services.glue.CfnClassifierProps.Builder)
      .xmlClassifier(xmlClassifier.orNull)
      .jsonClassifier(jsonClassifier.orNull)
      .csvClassifier(csvClassifier.orNull)
      .grokClassifier(grokClassifier.orNull)
      .build()
}
