package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecipeParametersProperty {

  def apply(
    removeLetters: Option[String] = None,
    multiLine: Option[Boolean] = None,
    isText: Option[String] = None,
    udfLang: Option[String] = None,
    aggregateFunction: Option[String] = None,
    removeSpecialCharacters: Option[String] = None,
    dateAddValue: Option[String] = None,
    count: Option[String] = None,
    patternOption1: Option[String] = None,
    startValue: Option[String] = None,
    removeLeadingAndTrailingWhitespace: Option[String] = None,
    removeAllPunctuation: Option[String] = None,
    secondaryInputs: Option[List[_]] = None,
    startPattern: Option[String] = None,
    datasetsColumns: Option[String] = None,
    lowerBound: Option[String] = None,
    removeLeadingAndTrailingPunctuation: Option[String] = None,
    pattern: Option[String] = None,
    mapType: Option[String] = None,
    startColumnIndex: Option[String] = None,
    targetIndex: Option[String] = None,
    includeInSplit: Option[String] = None,
    removeAllQuotes: Option[String] = None,
    removeSourceColumn: Option[String] = None,
    targetColumnNames: Option[String] = None,
    secondInput: Option[String] = None,
    columnRange: Option[String] = None,
    removeAllWhitespace: Option[String] = None,
    categoryMap: Option[String] = None,
    falseString: Option[String] = None,
    deleteOtherRows: Option[String] = None,
    groupByColumns: Option[String] = None,
    leftColumns: Option[String] = None,
    endValue: Option[String] = None,
    endPosition: Option[String] = None,
    hiddenColumns: Option[String] = None,
    modeType: Option[String] = None,
    sampleType: Option[String] = None,
    rightColumns: Option[String] = None,
    exponent: Option[String] = None,
    stopWordsMode: Option[String] = None,
    value1: Option[String] = None,
    base: Option[String] = None,
    removeLeadingAndTrailingQuotes: Option[String] = None,
    upperBound: Option[String] = None,
    endPattern: Option[String] = None,
    interval: Option[String] = None,
    sheetNames: Option[List[String]] = None,
    patternOptions: Option[String] = None,
    sourceColumns: Option[String] = None,
    charsToRemove: Option[String] = None,
    targetDateFormat: Option[String] = None,
    viewFrame: Option[String] = None,
    sourceColumn1: Option[String] = None,
    removeCustomCharacters: Option[String] = None,
    strategy: Option[String] = None,
    collapseConsecutiveWhitespace: Option[String] = None,
    removeCustomValue: Option[String] = None,
    units: Option[String] = None,
    orderByColumn: Option[String] = None,
    removeNumbers: Option[String] = None,
    stepCount: Option[String] = None,
    sheetIndexes: Option[List[_ <: Number]] = None,
    expandContractions: Option[String] = None,
    orderByColumns: Option[String] = None,
    caseStatement: Option[String] = None,
    dateTimeParameters: Option[String] = None,
    trueString: Option[String] = None,
    ignoreCase: Option[String] = None,
    position: Option[String] = None,
    sampleSize: Option[String] = None,
    joinKeys: Option[String] = None,
    valueColumn: Option[String] = None,
    patternOption2: Option[String] = None,
    sourceColumn: Option[String] = None,
    useNewDataFrame: Option[String] = None,
    value2: Option[String] = None,
    joinType: Option[String] = None,
    sourceColumn2: Option[String] = None,
    startPosition: Option[String] = None,
    tokenizerPattern: Option[String] = None,
    columnDataType: Option[String] = None,
    stepIndex: Option[String] = None,
    limit: Option[String] = None,
    customCharacters: Option[String] = None,
    value: Option[String] = None,
    groupByAggFunctionOptions: Option[String] = None,
    dateTimeFormat: Option[String] = None,
    numRowsAfter: Option[String] = None,
    input: Option[AnyRef] = None,
    numRowsBefore: Option[String] = None,
    customStopWords: Option[String] = None,
    stemmingMode: Option[String] = None,
    other: Option[String] = None,
    unpivotColumn: Option[String] = None,
    timeZone: Option[String] = None,
    customValue: Option[String] = None,
    period: Option[String] = None,
    numRows: Option[String] = None,
    delimiter: Option[String] = None,
    targetColumn: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty =
    (new software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty.Builder)
      .removeLetters(removeLetters.orNull)
      .multiLine(multiLine.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .isText(isText.orNull)
      .udfLang(udfLang.orNull)
      .aggregateFunction(aggregateFunction.orNull)
      .removeSpecialCharacters(removeSpecialCharacters.orNull)
      .dateAddValue(dateAddValue.orNull)
      .count(count.orNull)
      .patternOption1(patternOption1.orNull)
      .startValue(startValue.orNull)
      .removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace.orNull)
      .removeAllPunctuation(removeAllPunctuation.orNull)
      .secondaryInputs(secondaryInputs.map(_.asJava).orNull)
      .startPattern(startPattern.orNull)
      .datasetsColumns(datasetsColumns.orNull)
      .lowerBound(lowerBound.orNull)
      .removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation.orNull)
      .pattern(pattern.orNull)
      .mapType(mapType.orNull)
      .startColumnIndex(startColumnIndex.orNull)
      .targetIndex(targetIndex.orNull)
      .includeInSplit(includeInSplit.orNull)
      .removeAllQuotes(removeAllQuotes.orNull)
      .removeSourceColumn(removeSourceColumn.orNull)
      .targetColumnNames(targetColumnNames.orNull)
      .secondInput(secondInput.orNull)
      .columnRange(columnRange.orNull)
      .removeAllWhitespace(removeAllWhitespace.orNull)
      .categoryMap(categoryMap.orNull)
      .falseString(falseString.orNull)
      .deleteOtherRows(deleteOtherRows.orNull)
      .groupByColumns(groupByColumns.orNull)
      .leftColumns(leftColumns.orNull)
      .endValue(endValue.orNull)
      .endPosition(endPosition.orNull)
      .hiddenColumns(hiddenColumns.orNull)
      .modeType(modeType.orNull)
      .sampleType(sampleType.orNull)
      .rightColumns(rightColumns.orNull)
      .exponent(exponent.orNull)
      .stopWordsMode(stopWordsMode.orNull)
      .value1(value1.orNull)
      .base(base.orNull)
      .removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes.orNull)
      .upperBound(upperBound.orNull)
      .endPattern(endPattern.orNull)
      .interval(interval.orNull)
      .sheetNames(sheetNames.map(_.asJava).orNull)
      .patternOptions(patternOptions.orNull)
      .sourceColumns(sourceColumns.orNull)
      .charsToRemove(charsToRemove.orNull)
      .targetDateFormat(targetDateFormat.orNull)
      .viewFrame(viewFrame.orNull)
      .sourceColumn1(sourceColumn1.orNull)
      .removeCustomCharacters(removeCustomCharacters.orNull)
      .strategy(strategy.orNull)
      .collapseConsecutiveWhitespace(collapseConsecutiveWhitespace.orNull)
      .removeCustomValue(removeCustomValue.orNull)
      .units(units.orNull)
      .orderByColumn(orderByColumn.orNull)
      .removeNumbers(removeNumbers.orNull)
      .stepCount(stepCount.orNull)
      .sheetIndexes(sheetIndexes.map(_.asJava).orNull)
      .expandContractions(expandContractions.orNull)
      .orderByColumns(orderByColumns.orNull)
      .caseStatement(caseStatement.orNull)
      .dateTimeParameters(dateTimeParameters.orNull)
      .trueString(trueString.orNull)
      .ignoreCase(ignoreCase.orNull)
      .position(position.orNull)
      .sampleSize(sampleSize.orNull)
      .joinKeys(joinKeys.orNull)
      .valueColumn(valueColumn.orNull)
      .patternOption2(patternOption2.orNull)
      .sourceColumn(sourceColumn.orNull)
      .useNewDataFrame(useNewDataFrame.orNull)
      .value2(value2.orNull)
      .joinType(joinType.orNull)
      .sourceColumn2(sourceColumn2.orNull)
      .startPosition(startPosition.orNull)
      .tokenizerPattern(tokenizerPattern.orNull)
      .columnDataType(columnDataType.orNull)
      .stepIndex(stepIndex.orNull)
      .limit(limit.orNull)
      .customCharacters(customCharacters.orNull)
      .value(value.orNull)
      .groupByAggFunctionOptions(groupByAggFunctionOptions.orNull)
      .dateTimeFormat(dateTimeFormat.orNull)
      .numRowsAfter(numRowsAfter.orNull)
      .input(input.orNull)
      .numRowsBefore(numRowsBefore.orNull)
      .customStopWords(customStopWords.orNull)
      .stemmingMode(stemmingMode.orNull)
      .other(other.orNull)
      .unpivotColumn(unpivotColumn.orNull)
      .timeZone(timeZone.orNull)
      .customValue(customValue.orNull)
      .period(period.orNull)
      .numRows(numRows.orNull)
      .delimiter(delimiter.orNull)
      .targetColumn(targetColumn.orNull)
      .build()
}
