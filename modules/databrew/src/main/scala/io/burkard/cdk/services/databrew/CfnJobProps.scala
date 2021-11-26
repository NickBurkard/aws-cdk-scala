package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJobProps {

  def apply(
    `type`: String,
    name: String,
    roleArn: String,
    recipe: Option[software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty] = None,
    jobSample: Option[software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty] = None,
    validationConfigurations: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    outputs: Option[List[_]] = None,
    profileConfiguration: Option[software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty] = None,
    databaseOutputs: Option[List[_]] = None,
    encryptionKeyArn: Option[String] = None,
    encryptionMode: Option[String] = None,
    outputLocation: Option[software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty] = None,
    timeout: Option[Number] = None,
    projectName: Option[String] = None,
    maxCapacity: Option[Number] = None,
    dataCatalogOutputs: Option[List[_]] = None,
    logSubscription: Option[String] = None,
    datasetName: Option[String] = None,
    maxRetries: Option[Number] = None
  ): software.amazon.awscdk.services.databrew.CfnJobProps =
    (new software.amazon.awscdk.services.databrew.CfnJobProps.Builder)
      .`type`(`type`)
      .name(name)
      .roleArn(roleArn)
      .recipe(recipe.orNull)
      .jobSample(jobSample.orNull)
      .validationConfigurations(validationConfigurations.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .profileConfiguration(profileConfiguration.orNull)
      .databaseOutputs(databaseOutputs.map(_.asJava).orNull)
      .encryptionKeyArn(encryptionKeyArn.orNull)
      .encryptionMode(encryptionMode.orNull)
      .outputLocation(outputLocation.orNull)
      .timeout(timeout.orNull)
      .projectName(projectName.orNull)
      .maxCapacity(maxCapacity.orNull)
      .dataCatalogOutputs(dataCatalogOutputs.map(_.asJava).orNull)
      .logSubscription(logSubscription.orNull)
      .datasetName(datasetName.orNull)
      .maxRetries(maxRetries.orNull)
      .build()
}
